package com.phyleet.linkedListDemos.singleLink;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero6 = new HeroNode(6, "林冲", "豹子头");

        SingleLinkedList linkedList = new SingleLinkedList();

        linkedList.addByOrder(hero1);
        linkedList.addByOrder(hero2);
        linkedList.addByOrder(hero6);
        linkedList.addByOrder(hero3);
        linkedList.addByOrder(hero3);

        linkedList.showHeroList();

        HeroNode hero67 = new HeroNode(6, "鲁智深", "花和尚");
        System.out.println("=====================================================");
        linkedList.updateList(hero67);
        linkedList.showHeroList();
        System.out.println("=====================================================");
        linkedList.searchByNo(3);
        System.out.println("=====================================================");
        linkedList.deleteByNo(6);
        linkedList.showHeroList();
    }
}

class HeroNode {
    int no;
    String name;
    String nickName;
    HeroNode next;

    HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    public HeroNode() {
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

class SingleLinkedList {
    private HeroNode head = new HeroNode(0, null, null);

    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    public void showHeroList() {
        if (head.next == null) {
            System.out.println("链表为空, 请插入数据后再遍历.");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                return;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == heroNode.no) {
                flag = true;
                break;
            }
            if (temp.next.no > heroNode.no) {
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.printf("想要添加的英雄编号%d已经存在了,不能继续添加.\n", heroNode.no);
        } else {
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    public void updateList(HeroNode heroNode) {
        if (head.next == null) {
            System.out.println("链表为空, 请填充链表后再进行修改.");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp.no == heroNode.no) {
                flag = true;
                break;
            }
            if (temp == null) {
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = heroNode.name;
            temp.nickName = heroNode.nickName;
        } else {
            System.out.println("链表中不存在需要修改的英雄信息.");
        }
    }

    public void deleteByNo(int no) {
        if (head.next == null) {
            System.out.println("链表为空, 无法修改.");
            return;
        }
        HeroNode temp = head;
        boolean flag = true;
        while (true) {
            if (temp.next == null) {
                System.out.println("没有找到需要删除的英雄.");
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("没有找到需要删除的英雄.");
        }
    }

    public void searchByNo(int no) {
        if (head.next == null) {
            System.out.println("链表为空.");
            return;
        }
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                System.out.println("没有找到需要查找的英雄.");
                break;
            }
            if (temp.next.no == no) {
                System.out.println(temp.next);
                break;
            }
            temp = temp.next;
        }
    }
}
